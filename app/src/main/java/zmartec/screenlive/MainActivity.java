package zmartec.screenlive;

import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;

import zmartec.screenlive.adapter.MuktiWindowAdapter;

public class MainActivity extends AppCompatActivity implements MuktiWindowAdapter.MyItemClickListener,SurfaceTextureListener{

    private MuktiWindowAdapter mMuktiWindowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.multi_window);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        this.mMuktiWindowAdapter = new MuktiWindowAdapter();
        recyclerView.setAdapter(mMuktiWindowAdapter);
        this.mMuktiWindowAdapter.setOnItemClickListener(this);
        TextureView textureView = new TextureView(this);
        textureView.setSurfaceTextureListener(this);

    }

    @Override
    public void onItemClick(View view, int postion) {

    }


    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i1) {

    }

    @Override
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i1) {

    }

    @Override
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {

    }
}
