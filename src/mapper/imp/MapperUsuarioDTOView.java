package mapper.imp;

import mapper.Mapper;
import utils.UtilsDev;


public class MapperUsuarioDTOView implements Mapper<Usuario,UsuarioDTOView> {


    @Override
    public UsuarioDTOView map(Usuario entidade) {
        UsuarioDTOView retorno = new UsuarioDTOView();
        retorno.setNome(entidade.getNome());
        retorno.setCpfCensurado(UtilsDev.converterCPFCensurado(entidade.getCpf()));
        retorno.setId(entidade.getId());
        retorno.setRg(entidade.getRg());
        retorno.setDataNascimentoFormatada(UtilsDev.obterDataFormato("dd/MM/yyyy",entidade.getDataNascimento()));
        return retorno;
    }
}
