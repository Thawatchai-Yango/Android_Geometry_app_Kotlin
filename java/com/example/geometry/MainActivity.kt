package com.example.geometry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat

var gridRectangle: CardView? =null;
var gridSquare: CardView? =null;
var gridParallelogram: CardView? =null;
var gridRhombus: CardView? =null;
var gridTrapezium: CardView? =null;
var gridGeneralTriangle: CardView? =null;
var gridEquilateralTriangle: CardView? =null;
var gridRightTriangle: CardView? =null;
var gridIsoRightTriangle: CardView? =null;
var gridPolygon: CardView? =null;
var gridCircle: CardView? =null;
var gridSemiCircle: CardView? =null;
var gridAnnulus: CardView? =null;
var gridSectorCircle: CardView? =null;
var gridEllipse: CardView?= null;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridRectangle = findViewById(R.id.gridRectangle) as CardView
        gridSquare = findViewById(R.id.gridSquare) as CardView
        gridParallelogram =findViewById(R.id.gridParalle) as CardView
        gridRhombus = findViewById(R.id.gridRhombus) as CardView
        gridTrapezium = findViewById(R.id.gridTrape) as CardView
        gridGeneralTriangle = findViewById(R.id.gridGerTriangle) as CardView
        gridEquilateralTriangle = findViewById(R.id.gridEquTri) as CardView
        gridRightTriangle = findViewById(R.id.gridRighTri) as CardView
        gridIsoRightTriangle = findViewById(R.id.gridIso_Right_Tri) as CardView
        gridPolygon = findViewById(R.id.gridRegPolygon) as CardView
        gridCircle = findViewById(R.id.gridCircle) as CardView
        gridSemiCircle = findViewById(R.id.gridSemi_circle) as CardView
        gridAnnulus = findViewById(R.id.gridAnnulus) as CardView
        gridSectorCircle = findViewById(R.id.gridSector_circle) as CardView
        gridEllipse = findViewById(R.id.gridEllipse) as CardView

        gridRectangle!!.setOnClickListener{
            var intent = Intent(this,RectangleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridRectangle!!, "trans_rectangle")
            startActivity(intent, options.toBundle())
        }

        gridSquare!!.setOnClickListener{
            var intent = Intent(this,SquareActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridSquare!!, "trans_square")
            startActivity(intent, options.toBundle())
        }

        gridParallelogram!!.setOnClickListener{
            var intent = Intent(this,ParallelogramActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridParallelogram!!, "trans_parallel")
            startActivity(intent, options.toBundle())
        }

        gridRhombus!!.setOnClickListener{
            var intent = Intent(this,RhombusActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridRhombus!!, "trans_rhombus")
            startActivity(intent, options.toBundle())
        }

        gridTrapezium!!.setOnClickListener{
            var intent = Intent(this,TrapeziumActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridTrapezium!!, "trans_trapezium")
            startActivity(intent, options.toBundle())
        }

        gridGeneralTriangle!!.setOnClickListener{
            var intent = Intent(this,GeneralTriangleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridGeneralTriangle!!, "trans_ge_tri")
            startActivity(intent, options.toBundle())
        }

        gridEquilateralTriangle!!.setOnClickListener{
            var intent = Intent(this,EquilateralTriangleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridEquilateralTriangle!!, "trans_equi_tri")
            startActivity(intent, options.toBundle())
        }

        gridRightTriangle!!.setOnClickListener{
            var intent = Intent(this,RightTriangleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridRightTriangle!!, "trans_right_tri")
            startActivity(intent, options.toBundle())
        }

        gridIsoRightTriangle!!.setOnClickListener{
            var intent = Intent(this,IosRightTriangleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridIsoRightTriangle!!, "trans_iso_tri")
            startActivity(intent, options.toBundle())
        }

        gridPolygon!!.setOnClickListener{
            var intent = Intent(this,PolygonActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridPolygon!!, "trans_polygon")
            startActivity(intent, options.toBundle())
        }

        gridCircle!!.setOnClickListener{
            var intent = Intent(this,CircleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridCircle!!, "trans_circle")
            startActivity(intent, options.toBundle())
        }

        gridSemiCircle!!.setOnClickListener{
            var intent = Intent(this,SemiCircleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridSemiCircle!!, "trans_semi_circle")
            startActivity(intent, options.toBundle())
        }

        gridAnnulus!!.setOnClickListener{
            var intent = Intent(this,AnnulusActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridAnnulus!!, "trans_annulus")
            startActivity(intent, options.toBundle())
        }

        gridSectorCircle!!.setOnClickListener{
            var intent = Intent(this,SectorCircleActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridSectorCircle!!, "trans_sec_circle")
            startActivity(intent, options.toBundle())
        }

        gridEllipse!!.setOnClickListener{
            var intent = Intent(this,EllipseActivity::class.java)
            val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, gridEllipse!!, "trans_ellipse")
            startActivity(intent, options.toBundle())
        }
    }
}