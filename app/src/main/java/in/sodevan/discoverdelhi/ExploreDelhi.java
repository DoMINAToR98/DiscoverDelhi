package in.sodevan.discoverdelhi;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExploreDelhi extends Fragment {
  //  private List<Places> placesList=new ArrayList<>();
   // private RecyclerView recyclerView;
 //   private PlacesAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.activity_explore_delhi,container,false);

        //Recycler View implementation
  //      recyclerView =(RecyclerView)v.findViewById(R.id.recycler_view);
  //      mAdapter = new PlacesAdapter(placesList);
  //    RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getActivity());
  //      recyclerView.setLayoutManager(mLayoutManager);
        // First param is number of columns and second param is orientation i.e Vertical or Horizontal
        //StaggeredGridLayoutManager gridLayoutManager =
      //          new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
// Attach the layout manager to the recycler view
       // recyclerView.setLayoutManager(gridLayoutManager);
  //      recyclerView.addItemDecoration(new DividerItemDecoration(this.getActivity(), LinearLayoutManager.VERTICAL));
  //      recyclerView.setItemAnimator(new DefaultItemAnimator());
   //     recyclerView.setAdapter(mAdapter);
  //      preparePlacesData();
        return v;
    }
  /*  private void preparePlacesData(){
        Places places;
        places=new Places("Taj Mahal");
        placesList.add(places);
        Log.d("TAG","ADDING tag");
        places=new Places("Red Fort");
        Log.d("TAG","ADDING REDFORT");
        placesList.add(places);
        places=new Places("Mehtab Garden");
        placesList.add(places);
        Log.d("TAG","A x  c c");
        places=new Places("Ds;vmsvlsmk");
        placesList.add(places);

        mAdapter.notifyDataSetChanged();
    }
*/
}
