package org.ust.StructualDesignPattern.Adapter.GraphicRender;

public class GraphicsPatternDemo {

    public static void main(String[] args) {
        RasterGraphics rasterGraphics = new RasterGraphics();
        VectorGraphicsInterface rasterToVectorAdapter = new RasterToVectorAdapter(rasterGraphics);
        rasterToVectorAdapter.drawLine();
        rasterToVectorAdapter.drawSquare();
    }
}
