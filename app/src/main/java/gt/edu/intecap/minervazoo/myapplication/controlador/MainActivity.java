package gt.edu.intecap.minervazoo.myapplication.controlador;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import gt.edu.intecap.minervazoo.myapplication.R;
import gt.edu.intecap.minervazoo.myapplication.vista.AcercaDe;
import gt.edu.intecap.minervazoo.myapplication.vista.Ayuda;
import gt.edu.intecap.minervazoo.myapplication.vista.Contacto;
import gt.edu.intecap.minervazoo.myapplication.vista.Galeria;
import gt.edu.intecap.minervazoo.myapplication.vista.Galeria_3D;
import gt.edu.intecap.minervazoo.myapplication.vista.Noticias;
import gt.edu.intecap.minervazoo.myapplication.vista.Proyecto;
import gt.edu.intecap.minervazoo.myapplication.vista.Tour;
import gt.edu.intecap.minervazoo.myapplication.vista.Ubicacion;
import gt.edu.intecap.minervazoo.myapplication.vista.actividad.YouTube;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Fragment fragment = null;
        FragmentManager fragmentManager = getSupportFragmentManager();;
        fragment = new Noticias();
        fragmentManager.beginTransaction().replace(R.id.contenedor_fragments, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        boolean fragmentTransaction = false;
        Fragment fragment = null;
        int id = item.getItemId();
        if (id == R.id.nav_noticias) {
            fragment = new Noticias();
            fragmentTransaction= true;
        } else if (id == R.id.nav_galeria) {
            fragment = new Galeria();
            fragmentTransaction = true;
        } else if (id == R.id.nav_galeria3D) {
            fragment = new Galeria_3D();
            fragmentTransaction = true;
        } else if (id == R.id.nav_videos) {
            Intent videos = new Intent(getApplicationContext(), YouTube.class);
            startActivity(videos);
        } else if (id == R.id.nav_proyectos) {
            fragment = new Proyecto();
            fragmentTransaction = true;
        } else if (id == R.id.nav_ayudanos) {
            fragment = new Ayuda();
            fragmentTransaction = true;
        } else if (id == R.id.nav_tour) {
            fragment = new Tour();
            fragmentTransaction = true;
        } else if (id == R.id.nav_contacto) {
            fragment = new Contacto();
            fragmentTransaction = true;
        } else if (id == R.id.nav_ubicacion) {
            fragment = new Ubicacion();
            fragmentTransaction = true;
        } else if (id == R.id.nav_acercaDe) {
            fragment = new AcercaDe();
            fragmentTransaction= true;
        }
        if (fragmentTransaction) {
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor_fragments, fragment)
                    .commit();
            item.setChecked(true);
            getSupportActionBar().setTitle(item.getTitle());
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
