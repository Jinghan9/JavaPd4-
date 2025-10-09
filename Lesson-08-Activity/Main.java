class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){

  }
  void print (string msg){
   	system.out.println(msg);
}

  
Ftoc(double F){
	Double C =(F-32) * 9/5.0;
	return c;
}

double sphereVolume(double radius) {
	double v=(4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
	return v;
    }


double coneVolume(double radius, double height) {
	double height =(1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
	return height;
}

double distance(double x1, double y1, double x2, double y2) {
	 double dx = x2 - x1;
     double dy = y2 - y1;
	 return Math.sqrt(dx * dx + dy * dy);
}










}

