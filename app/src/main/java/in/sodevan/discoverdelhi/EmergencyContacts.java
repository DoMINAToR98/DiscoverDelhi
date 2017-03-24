package in.sodevan.discoverdelhi;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EmergencyContacts extends Fragment {
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_emergency_contacts, container, false);
        listView=(ListView)v.findViewById(R.id.emergency_listview);

        ArrayAdapter<String> madapter=new ArrayAdapter<String>(getActivity()
                ,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.emergency_places));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(getActivity(),Emergency_contacts_second.class);
                intent.putExtra("Emergency Areas",listView.getItemAtPosition(position).toString());
                startActivity(intent);


            }
        });
        listView.setAdapter(madapter);

        return v;

    }
}

