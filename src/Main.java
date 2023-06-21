import mapper.Mapper;
import mapper.imp.MapperUsuarioDTOView;
import mapper.imp.Usuario;
import mapper.imp.UsuarioDTOView;

import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario(
                "Ryan",
                "11133322213",
                "4691427",
                new Date()
        );
        novoUsuario.setId(1L);
        Mapper<Usuario, UsuarioDTOView> mapper = new MapperUsuarioDTOView();
        UsuarioDTOView retorno = mapper.map(novoUsuario);
        System.out.printf(retorno.toString());
    }
}