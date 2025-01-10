package academy.devdojo.maratonajava.javacore.M_interface.dominio;

public class DataBaseLoader implements DataLoader, DataRemover {

    // private -> default -> protected -> public

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados ");
    }

    @Override
    public void remover() {
        System.out.println("Removendo dados do banco de dados ");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando de permissões do banco de dados");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize na classe DataBaseLoader");
    }
}
