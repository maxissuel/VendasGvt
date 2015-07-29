package com.example.vendasgvt;
import java.io.*;
import android.content.*;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	private static String DBPATH = "/data/data/com.solucaoSistemas.VendasGvt/databases/";
	private static String DBNAME = "VendasGvt.sqlite";
	private Context context;
	
	public DatabaseHelper(Context context){
		super(context, DBNAME, null, 1);
		this.context = context;
	}
	
	@Override
	public void onCreate(SQLiteDatabase arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean checkDatabase(){
		SQLiteDatabase db = null;
		
		try{
			String path = DBPATH+DBNAME;
			db = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
			db.close();
		}catch(SQLiteException e){
			//o banco n�o existe
		}
		
		return db != null;
	}
	
	
	private void createDataBase() throws Exception {
			boolean exists = checkDatabase ();
			
			if(! exists) {

				this.getReadableDatabase();
	
				try {
					copyDatabase();
				} catch ( IOException e ) {
					throw new Error ("N�o foi poss�vel copiar o arquivo" );
				}
			}
	}
			/**
			* Esse m�todo � respons�vel por copiar o banco do diret�rio
			* assets para o diret�rio padr�o do android.
			*/
	private void copyDatabase() throws IOException {
			String dbPath = DBPATH + DBNAME ;
			
			OutputStream dbStream = new FileOutputStream(dbPath );

			InputStream dbInputStream =	context.getAssets().open(DBNAME);
			
			byte [] buffer = new byte [1024];
			int length ;
			
			while (( length = dbInputStream . read(buffer )) > 0) {
				dbStream. write ( buffer, 0 , length );
			}
			dbInputStream . close ();
			dbStream .flush();
			dbStream .close ();
			}
			public SQLiteDatabase getDatabase() {
				try {
	
					createDataBase ();
					// Abrindo database
					String path = DBPATH + DBNAME ;
					return SQLiteDatabase . openDatabase (path , null ,SQLiteDatabase.OPEN_READWRITE );
				} catch (Exception e ) {
						return getWritableDatabase();
					}

			}
}
