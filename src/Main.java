import mapper.Mapper;
import mapper.imp.*;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        UsuarioDTOForm novoUsuario = new UsuarioDTOForm(
                "Ryan",
                "11133322213",
                "4691427",
                new Date()
        );
        Mapper<UsuarioDTOForm, Usuario> mapper = new MapperUsuarioDTOForm();
        Usuario retorno = mapper.map(novoUsuario);
        System.out.printf(retorno.toString());
    }
}