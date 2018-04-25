package HW_OOP;

public class Rectangle {
	int  length;
	int  width;
	
	public Rectangle(){
		
	}
	public Rectangle (int l , int  w	){
		if (l < 0 || w < 0){
			System.out.println("Error!! Length and with must be greater than 0");
		}else{
			length = l;
			width = w;
		}
	}
	public int Square(){
		return length * width;
	}
	public int Perimeter(){
		return (length + width )* 2;
	}
//	public void Draw(){
//		char[][] rect = new char[length][width];
//		for (int i = 0; i < rect.length; i++) {
//			for (int j = 0; j < rect[0].length; j++) {
//				System.out.print(rect[i][j]);
//			}
//			System.out.println(" ");
//		}
//	}
public void Draw(){
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				if(i!=0 && i!= length-1 && j!= 0 && j!= width-1){
					System.out.print(" ");
				}
				if(i == 0 || i == length-1 ){
					System.out.print("*");
				}else if(i!=0 && i != length-1 &&j == 0 || j == width-1  ){
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}

}
