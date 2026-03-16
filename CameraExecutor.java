class CameraExecutor{

  public static void main(String[] args){

    Camera.power();

    int zoom = Camera.getZoom();
    System.out.println("Current Zoom Level: " + zoom);

    Camera.zoomIn();
    Camera.zoomIn();
    zoom = Camera.getZoom();
    System.out.println("Zoom after increase: " + zoom);

    Camera.zoomOut();
	Camera.zoomOut();
	Camera.zoomOut();
    zoom = Camera.getZoom();
    System.out.println("Zoom after decrease: " + zoom);
  }
}