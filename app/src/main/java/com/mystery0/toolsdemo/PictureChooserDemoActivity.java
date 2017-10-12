package com.mystery0.toolsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vip.mystery0.tools.pictureChooser.iPictureChooser;
import vip.mystery0.tools.pictureChooser.iPictureChooserListener;

import java.util.ArrayList;
import java.util.List;

public class PictureChooserDemoActivity extends AppCompatActivity
{
	private iPictureChooser pictureChooser;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_picture_chooser_demo);

		pictureChooser = (iPictureChooser) findViewById(R.id.i_picture_chooser);
		List<String> list = new ArrayList<>();
		list.add("http://ww2.sinaimg.cn/orj480/76da98c1gw1f5yhzht65hj20qo1bfgul.jpg");
		pictureChooser.setDataList(R.drawable.ic_android, new iPictureChooserListener()
		{
			@Override
			public void MainClick()
			{
				Intent intent = new Intent(Intent.ACTION_PICK);
				intent.setType("image/*");
				startActivityForResult(intent, iPictureChooser.Code.getIMG_CHOOSE());
			}
		});
		pictureChooser.setList(list);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		if (requestCode == iPictureChooser.Code.getIMG_CHOOSE())
		{
			if (data != null)
			{
				pictureChooser.setUpdatedPicture(data.getData());
			}
		}
	}
}
