package in.sodevan.discoverdelhi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ModesofTransport extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modesof_transport);

        listView=(ListView)findViewById(R.id.modes_of_transport);

        ArrayAdapter<String> madapter=new ArrayAdapter<String>(this
                ,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.modes_of_transport));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    Intent intent = new Intent(getApplicationContext(), Modesof_Transport_Second.class);
                    intent.putExtra("Modes of Transport", listView.getItemAtPosition(position).toString());
                    startActivity(intent);



            }
        });
        listView.setAdapter(madapter);
    }
}
