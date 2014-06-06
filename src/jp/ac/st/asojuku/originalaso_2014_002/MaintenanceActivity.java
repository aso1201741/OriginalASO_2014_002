package jp.ac.st.asojuku.originalaso_2014_002;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MaintenanceActivity extends MainActivity implements View.OnClickListener{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenance_activity);
		Button btn1 = (Button)findViewById(R.id.maintenance_btn1);
		Button btn2 = (Button)findViewById(R.id.maintenance_btn2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		MySQLiteOpenHelper da = new MySQLiteOpenHelper(this);
		android.database.sqlite.SQLiteDatabase db = da.getReadableDatabase();


		String sql = "SELECT * FROM Hitokoto";
		Cursor cr = db.rawQuery(sql,null);
		ArrayAdapter<String[]> ad = new ArrayAdapter<String[]>(this, R.layout.rowdata);
		boolean eof = cr.moveToFirst();
		while(eof){
			String[] x = new String[2];
			x[0] = cr.getString(0);
			x[1] = cr.getString(1);
			ad.add(x);
			eof = cr.moveToNext();
		}
		cr.close();
		db.close();
		ListView vlistview = (ListView)findViewById(R.id.maintenance_list);
		vlistview.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
		vlistview.setAdapter(ad);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){
		case R.id.maintenance_btn1:
			finish();
			break;
		case R.id.maintenance_btn2:

			break;
		}
	}

}