package in.sodevan.discoverdelhi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton img_intern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img_intern=(ImageButton)findViewById(R.id.img_intern);
        img_intern.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intern=new Intent(MainActivity.this,Intern.class);

        startActivity(intern);

    }
}
