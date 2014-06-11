package jp.ac.st.asojuku.originalaso_2014_002;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HitokotoActivity extends MainActivity{
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hitokoto_activity);
		Intent vIntent = getIntent();
		String strHitokoto = vIntent.getStringExtra("HITOKOTO");
		TextView tv = (TextView)findViewById(R.id.hitokoto_text1);
		tv.setText(strHitokoto);
	}
}