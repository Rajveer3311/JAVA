public class HelloWorldWIthoutSemiColon
{
	public static void main(String[] args) {
		if (System.out.printf("Hello World"+"\n")==null) {
			
		}
		if (System.out.append("Hello World"+"\n")==null) {
			
		}
		if (System.out.append("Hello World"+"\n").equals(null)) {
			
		}
		for (int i=0;i<10 ;System.out.printf("Hello World"+"\n") ) {
			i++;
		}
	}
}