package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn1 = (Button)findViewById(R.id.main_btn1);
		Button btn2 = (Button)findViewById(R.id.main_btn2);
		Button btn3 = (Button)findViewById(R.id.main_btn3);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		Intent vIntent = null;
		switch(v.getId()){
		case R.id.main_btn1:
			vIntent = new Intent(this,MaintenanceActivity.class);
			startActivity(vIntent);
			break;
		case R.id.main_btn2:
			EditText et = (EditText)findViewById(R.id.main_edt1);
			String txt = et.getText().toString();
			MySQLiteOpenHelper da = new MySQLiteOpenHelper(this);
			android.database.sqlite.SQLiteDatabase db = da.getReadableDatabase();
			String sql = "INSERT INTO Hitokoto(phrase) VALUES('" + txt + "')";
			db.execSQL(sql);
			db.close();
			break;
		case R.id.main_btn3:
			vIntent = new Intent(this,HitokotoActivity.class);
			startActivity(vIntent);
			break;
		}
	}

}
