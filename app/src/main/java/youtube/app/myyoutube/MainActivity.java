package youtube.app.myyoutube;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MainActivity extends AppCompatActivity {

//    private Button form;

    private Button btn1,btn2,btn3,btn4,btn5,btn6;
    private TextView videoTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);




        videoTitle = (TextView)findViewById(R.id.videoTitle);

        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video A");
                        youTubePlayer.loadVideo("-xGIrgmGHuA", 0);
                    }
                });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video B");
                        youTubePlayer.loadVideo("EtPK6kM3yys", 0);
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video C");
                        youTubePlayer.loadVideo("pbUZk3ZdmJQ",0);
                    }
                });
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video D");
                        youTubePlayer.loadVideo("pbUZk3ZdmJQ",0);
                    }
                });
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video E");
                        youTubePlayer.loadVideo("UQRgR2PjMFg",0);
                    }
                });
                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        videoTitle.setText("Video F");
                        youTubePlayer.loadVideo("pH2MGmtK4wI",0);
                    }
                });



            }
        });




//        form = (Button)findViewById(R.id.btnForm);

//        form.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_LONG).show();
//
//                Intent intent = new Intent(getApplicationContext(),FormActivity.class);
//                startActivity(intent);
//
//
//
//            }
//        });


    }
}