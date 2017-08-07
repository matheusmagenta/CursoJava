import javax.swing.JOptionPane;

public class AdivinhaNumero03 {

	public static void main(String[] args) {
		
	
				
		int gerado = (int)(Math.random() *100);
		int digitado = 0, tentativas = 0, digitadomenor = 0, digitadomaior = 100;
		
		do {
			tentativas++;
			digitado = Integer.parseInt(JOptionPane.showInputDialog ("Informe um número entre " + digitadomenor + "e " + digitadomaior));
			
			if(digitado < digitadomenor || digitado > digitadomaior){
			continue;	
			}
			
			if(digitado < gerado){
				digitadomenor = digitado + 1 ;
				
			} else if(digitado > gerado){
				digitadomaior = digitado - 1;

			}
		} while(gerado != digitado);
		JOptionPane.showMessageDialog(null,"VocÊ acertou em " + tentativas + " tentativas");
		
	}
	
		
	}


