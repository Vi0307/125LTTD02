package com.example.havi_btweek5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    String[] funFacts = {
            "🐧 Chim cánh cụt bơi rất giỏi.",
            "🌙 Núi lửa trên sao Hỏa cao gấp 3 lần Everest.",
            "🦄 Kỳ lân từng được coi là có thật.",
            "🍫 Sô-cô-la từng làm tiền tệ ở Trung Mỹ cổ đại.",
            "🐢 Rùa có thể thở bằng mông khi ngủ đông.",
            "🚀 Một ngày trên sao Kim dài hơn một năm của nó."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView fact1 = findViewById(R.id.fact1);
        TextView fact2 = findViewById(R.id.fact2);
        TextView fact3 = findViewById(R.id.fact3);

        Random random = new Random();
        int len = funFacts.length;

        fact1.setText(funFacts[random.nextInt(len)]);
        fact2.setText(funFacts[random.nextInt(len)]);
        fact3.setText(funFacts[random.nextInt(len)]);
    }
}
