package org.ust.StructualDesignPattern.Adapter.GraphicRender;


//Adapter
public class RasterToVectorAdapter implements VectorGraphicsInterface{
    RasterGraphics rasterGraphics;

    public RasterToVectorAdapter(RasterGraphics rasterGraphics){
        this.rasterGraphics = rasterGraphics;
    }

    @Override
    public void drawLine() {
        rasterGraphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rasterGraphics.drawRasterSquare();
    }
}
