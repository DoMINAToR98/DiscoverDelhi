package in.sodevan.discoverdelhi;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.scalified.fab.ActionButton;

import java.util.Locale;

public class About extends AppCompatActivity {
    Button ourimpact,awards;
    ActionButton actionButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        actionButton=(ActionButton)findViewById(R.id.action_button);
        actionButton.show();
        // To set the button type:
        actionButton.setType(ActionButton.Type.DEFAULT);
        // To get the button type:
        ActionButton.Type type = actionButton.getType();
        actionButton.setButtonColor(getResources().getColor(R.color.fab_material_light_blue_900));
        // To set button color for pressed state:
        actionButton.setButtonColorPressed(getResources().getColor(R.color.fab_material_light_blue_500));
        actionButton.setImageResource(R.drawable.locationmarker);
        actionButton.setImageSize(24);
        actionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = String.format(Locale.ENGLISH,"https://www.google.com/maps?saddr=My+Location&daddr=28.530825, 77.207396");
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                startActivity(intent);

            }
        });
        ourimpact=(Button)findViewById(R.id.about_impact);
        ourimpact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abtimpact=new Intent(About.this,about_ourimapct.class);
                startActivity(abtimpact);
            }
        });
        awards=(Button)findViewById(R.id.about_awd);
        awards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abtawd=new Intent(About.this,about_recentawards.class);
                startActivity(abtawd);
            }
        });
    }


}
