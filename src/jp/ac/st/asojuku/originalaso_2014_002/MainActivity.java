package jp.ac.st.asojuku.originalaso_2014_002;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
			break;
		case R.id.main_btn2:

			break;
		case R.id.main_btn3:
			vIntent = new Intent(this,HitokotoActivity.class);
			break;
		}
		startActivity(vIntent);
	}

}
