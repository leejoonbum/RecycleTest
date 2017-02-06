package taca.com.recycleviewtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class NewPostActivity extends AppCompatActivity {

    EditText title, content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        title = (EditText) findViewById(R.id.post_title);
        content = (EditText) findViewById(R.id.post_content);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSendPost();
            }
        });
    }

    public void onSendPost(){

        // 작성글 입력
        // 제목, 내용이 존재해야함
        // 비속어 처리
        // 입력을 못하게 막아야함 (편집불가)
        // 회원이 맞는지 체크
        // 로딩 시작
        // 글 작성 업로드
        // 입력 잠금 해제
        // 로딩 닫기
        // 화면 닫힘

    }

}
