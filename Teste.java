public class Teste {
    
    public static void main(String[] args) {

        Plano ouro = new PlanoOuro();
        Plano prata = new PlanoPrata();
        Plano bronze = new PlanoBronze();

        Torcedor torcedor = new Torcedor("Luana");

        SocioTorcedor socio = new SocioTorcedor();

        socio.mensagem(torcedor, ouro);
        socio.mensagem(torcedor, prata);
        socio.mensagem(torcedor, bronze);
        
    }

   }
