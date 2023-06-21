package mapper.imp;

import mapper.Mapper;

public class MapperUsuarioDTOForm implements Mapper<UsuarioDTOForm,Usuario> {
    @Override
    public Usuario map(UsuarioDTOForm entidade) {
        Usuario retorno = new Usuario();
        retorno.setNome(entidade.getNome());
        retorno.setRg(entidade.getRg());
        retorno.setDataNascimento(entidade.getDataNascimento());
        retorno.setCpf(entidade.getCpf());
        return retorno;
    }
}
