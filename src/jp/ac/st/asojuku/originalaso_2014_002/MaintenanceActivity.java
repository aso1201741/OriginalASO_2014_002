package jp.ac.st.asojuku.originalaso_2014_002;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaintenanceActivity extends MainActivity implements View.OnClickListener{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenance_activity);
		Button btn1 = (Button)findViewById(R.id.maintenance_btn1);
		Button btn2 = (Button)findViewById(R.id.maintenance_btn2);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
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