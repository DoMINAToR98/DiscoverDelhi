package in.sodevan.discoverdelhi;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by kartiksharma on 14/02/17.
 */

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder>{
    private List<Places> placesList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }
    public PlacesAdapter(List<Places> placesList){
        this.placesList=placesList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.places_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Log.d("Tag","position earlier"+position);
        Places places=placesList.get(position);
        Log.d("Tag","position later"+position);
        holder.title.setText(places.getTitle());
        Log.d("Tag1",places.getTitle());
    }



    @Override
    public int getItemCount() {
        return placesList.size();
    }
}
