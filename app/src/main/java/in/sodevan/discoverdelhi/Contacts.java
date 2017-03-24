package in.sodevan.discoverdelhi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Contacts extends Fragment {
    ListView listView;
    Intent chooser=null;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_contacts, container, false);
        listView=(ListView)v.findViewById(R.id.emergency_contacts_listview);

        ArrayAdapter<String> madapter=new ArrayAdapter<String>(getActivity()
                ,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.emergency_aiesec_contacts));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //  Log.d("Tag_posit",String.valueOf(listView.getItemIdAtPosition(position)));
               if((listView.getItemIdAtPosition(position))==0){
                   Intent intent=new Intent(Intent.ACTION_SEND);
                   intent.setData(Uri.parse("mailto:"));
                   String[] to={"tushar298.jain@aiesec.net"};
                   intent.putExtra(Intent.EXTRA_EMAIL,to);
                   intent.setType("message/rfc822");
                   chooser=Intent.createChooser(intent,"send email");
                   startActivity(chooser);
               }
               else if ((listView.getItemIdAtPosition(position))==1){
                   Intent intent=new Intent(Intent.ACTION_SEND);
                   intent.setData(Uri.parse("mailto:"));
                   String[] to={"Surbhi.Mahajan@aiesec.net"};
                   intent.putExtra(Intent.EXTRA_EMAIL,to);
                   intent.setType("message/rfc822");
                   chooser=Intent.createChooser(intent,"send email");
                   startActivity(chooser);
               }
               else if ((listView.getItemIdAtPosition(position))==2){
                   Intent intent=new Intent(Intent.ACTION_SEND);
                   intent.setData(Uri.parse("mailto:"));
                   String[] to={"akki.nagpal@aiesec.net"};
                   intent.putExtra(Intent.EXTRA_EMAIL,to);
                   intent.setType("message/rfc822");
                   chooser=Intent.createChooser(intent,"send email");
                   startActivity(chooser);
               }

            }
        });
        listView.setAdapter(madapter);

        return v;
    }
}
