package org.hieulm.badosa;

import java.util.ArrayList;

import org.hieulm.badosa.R;
import org.hieulm.util.EntryAdapter;
import org.hieulm.util.EntryItem;
import org.hieulm.util.Item;
import org.hieulm.util.SectionItem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemClickListener {

	ArrayList<Item> items = new ArrayList<Item>();
	 ListView listview=null;
	 
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
      
       listview=(ListView)findViewById(R.id.listView_main);
       
       items.add(new SectionItem("Bán"));// Section Title
       items.add(new EntryItem("Căn Hộ Chung Cư"));
       items.add(new EntryItem("Nhà Riêng"));
       items.add(new EntryItem("Đất Nền"));
       items.add(new EntryItem("Loại Khác"));
       
       items.add(new SectionItem("Cho Thuê"));
       items.add(new EntryItem("Căn Hộ Chung Cư"));
       items.add(new EntryItem("Nhà Riêng"));
       items.add(new EntryItem("Phòng Trọ"));
       items.add(new EntryItem("Văn Phòng"));
       items.add(new EntryItem("Loại Khác"));
       
       EntryAdapter adapter = new EntryAdapter(this, items);
       listview.setAdapter(adapter);
       listview.setOnItemClickListener(this);
   }
   

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
		EntryItem item = (EntryItem)items.get(position);
		Toast.makeText(this, "You clicked " + item.getTitle() , Toast.LENGTH_SHORT).show();
	}
    
}
