package com.example.jakobhoy.synthesizer;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button c, c_sharp, d, d_sharp, e, f, f_sharp, g, g_sharp, a, a_sharp, b, c2, timbre1, timbre2, timbre3, timbre4;

    private SoundPool soundPool;

     private int sound_c, sound_c_sharp, sound_d, sound_d_sharp, sound_e, sound_f, sound_f_sharp, sound_g, sound_g_sharp, sound_a, sound_a_sharp, sound_b, sound_c2 ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        c = (Button) findViewById(R.id.c);
        c_sharp = (Button) findViewById(R.id.csharp);
        d = (Button) findViewById(R.id.d);
        d_sharp = (Button) findViewById(R.id.dsharp);
        e = (Button) findViewById(R.id.e);
        f = (Button) findViewById(R.id.f);
        f_sharp = (Button) findViewById(R.id.fsharp);
        g = (Button) findViewById(R.id.g);
        g_sharp = (Button) findViewById(R.id.gsharp);
        a = (Button) findViewById(R.id.a);
        a_sharp = (Button) findViewById(R.id.asharp);
        b = (Button) findViewById(R.id.b);
        c2 = (Button) findViewById(R.id.c2);



        timbre1 = (Button) findViewById(R.id.timbre1);
        timbre2 = (Button) findViewById(R.id.timbre2);
        timbre3 = (Button) findViewById(R.id.timbre3);
        timbre4 = (Button) findViewById(R.id.timbre4);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundPool = new SoundPool.Builder().setMaxStreams(5).build();
        }
        else{
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }



        timbre1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change1();
            }
        });

        timbre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change2();
            }
        });

        timbre3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change3();
            }
        });

        timbre4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                change4();
            }
        });


            sound_c = soundPool.load(this, R.raw.cpiano, 1);
            sound_c_sharp = soundPool.load(this, R.raw.csharppiano, 1);
            sound_d = soundPool.load(this, R.raw.dpiano, 1);
            sound_d_sharp = soundPool.load(this, R.raw.dsharppiano, 1);
            sound_e = soundPool.load(this, R.raw.epiano, 1);
            sound_f = soundPool.load(this, R.raw.fpiano, 1);
            sound_f_sharp = soundPool.load(this, R.raw.fsharppiano, 1);
            sound_g = soundPool.load(this, R.raw.gpiano, 1);
            sound_g_sharp = soundPool.load(this, R.raw.gsharppiano, 1);
            sound_a = soundPool.load(this, R.raw.apiano, 1);
            sound_a_sharp = soundPool.load(this, R.raw.asharppiano, 1);
            sound_b = soundPool.load(this, R.raw.bpiano, 1);
            sound_c2 = soundPool.load(this, R.raw.c2piano, 1);





        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_c, 1, 1, 0, 0, 1);
            }
        });

         c_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_c_sharp, 1, 1, 0, 0, 1);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_d, 1, 1, 0, 0, 1);
            }
        });

         d_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_d_sharp, 1, 1, 0, 0, 1);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_e, 1, 1, 0, 0, 1);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_f, 1, 1, 0, 0, 1);
            }
        });

         f_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_f_sharp, 1, 1, 0, 0, 1);
            }
        });


        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_g, 1, 1, 0, 0, 1);
            }
        });

         g_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_g_sharp, 1, 1, 0, 0, 1);
            }
        });

             a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_a, 1, 1, 0, 0, 1);
            }
        });

          a_sharp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_a_sharp, 1, 1, 0, 0, 1);
            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_b, 1, 1, 0, 0, 1);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(sound_c2, 1, 1, 0, 0, 1);
            }
        });



    }


    // PIANO        GUITAR         BASS         FLUTE //

    public void change1 (){


            sound_c = soundPool.load(this, R.raw.cpiano, 1);
            sound_c_sharp = soundPool.load(this, R.raw.csharppiano, 1);
            sound_d = soundPool.load(this, R.raw.dpiano, 1);
            sound_d_sharp = soundPool.load(this, R.raw.dsharppiano, 1);
            sound_e = soundPool.load(this, R.raw.epiano, 1);
            sound_f = soundPool.load(this, R.raw.fpiano, 1);
            sound_f_sharp = soundPool.load(this, R.raw.fsharppiano, 1);
            sound_g = soundPool.load(this, R.raw.gpiano, 1);
            sound_g_sharp = soundPool.load(this, R.raw.gsharppiano, 1);
            sound_a = soundPool.load(this, R.raw.apiano, 1);
            sound_a_sharp = soundPool.load(this, R.raw.asharppiano, 1);
            sound_b = soundPool.load(this, R.raw.bpiano, 1);
            sound_c2 = soundPool.load(this, R.raw.c2piano, 1);


    }

    public void change2 (){


            sound_c = soundPool.load(this, R.raw.cguitar, 1);
            sound_c_sharp = soundPool.load(this, R.raw.csharpguitar, 1);
            sound_d = soundPool.load(this, R.raw.dguitar, 1);
            sound_d_sharp = soundPool.load(this, R.raw.dsharpguitar, 1);
            sound_e = soundPool.load(this, R.raw.eguitar, 1);
            sound_f = soundPool.load(this, R.raw.fguitar, 1);
            sound_f_sharp = soundPool.load(this, R.raw.fsharpguitar, 1);
            sound_g = soundPool.load(this, R.raw.gguitar, 1);
            sound_g_sharp = soundPool.load(this, R.raw.gsharpguitar, 1);
            sound_a = soundPool.load(this, R.raw.aguitar, 1);
            sound_a_sharp = soundPool.load(this, R.raw.asharpguitar, 1);
            sound_b = soundPool.load(this, R.raw.bguitar, 1);
            sound_c2 = soundPool.load(this, R.raw.c2guitar, 1);


    }

    public void change3(){

            sound_c = soundPool.load(this, R.raw.cbass, 1);
            sound_c_sharp = soundPool.load(this, R.raw.csharpbass, 1);
            sound_d = soundPool.load(this, R.raw.dbass, 1);
            sound_d_sharp = soundPool.load(this, R.raw.dsharpbass, 1);
            sound_e = soundPool.load(this, R.raw.ebass, 1);
            sound_f = soundPool.load(this, R.raw.fbass, 1);
            sound_f_sharp = soundPool.load(this, R.raw.fsharpbass, 1);
            sound_g = soundPool.load(this, R.raw.gbass, 1);
            sound_g_sharp = soundPool.load(this, R.raw.gsharpbass, 1);
            sound_a = soundPool.load(this, R.raw.abass, 1);
            sound_a_sharp = soundPool.load(this, R.raw.asharpbass, 1);
            sound_b = soundPool.load(this, R.raw.bbass, 1);
            sound_c2 = soundPool.load(this, R.raw.c2bass, 1);

    }

    public void change4(){

            sound_c = soundPool.load(this, R.raw.cflute, 1);
            sound_c_sharp = soundPool.load(this, R.raw.csharpflute, 1);
            sound_d = soundPool.load(this, R.raw.dflute, 1);
            sound_d_sharp = soundPool.load(this, R.raw.dsharpflute, 1);
            sound_e = soundPool.load(this, R.raw.eflute, 1);
            sound_f = soundPool.load(this, R.raw.fflute, 1);
            sound_f_sharp = soundPool.load(this, R.raw.fsharpflute, 1);
            sound_g = soundPool.load(this, R.raw.gflute, 1);
            sound_g_sharp = soundPool.load(this, R.raw.gsharpflute, 1);
            sound_a = soundPool.load(this, R.raw.aflute, 1);
            sound_a_sharp = soundPool.load(this, R.raw.asharpflute, 1);
            sound_b = soundPool.load(this, R.raw.bflute, 1);
            sound_c2 = soundPool.load(this, R.raw.c2flute, 1);

    }


}
