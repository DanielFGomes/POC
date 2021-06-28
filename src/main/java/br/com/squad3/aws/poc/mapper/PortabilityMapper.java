package br.com.squad3.aws.poc.mapper;

import br.com.squad3.aws.poc.enums.AddressType;
import br.com.squad3.aws.poc.model.Address;
import br.com.squad3.aws.poc.model.Mp3Message;
import br.com.squad3.aws.poc.model.Portability;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@UtilityClass
public class PortabilityMapper {

    public static Portability to(Mp3Message message) {
        return Portability.builder()
                .portabilityNumber(message.getNumeroPortabilidade())
                .fullname(message.getNomeCompleto())
                .contractValue(message.getValorContrato())
                .interestRate(message.getTaxaJuros())
                .amountInstallments(message.getQuantidadeParcelas())
                .dueDate(message.getDataVencimento())
                .addresses(buildAddresses(message))
                .build();
    }

    private static List<Address> buildAddresses(Mp3Message message) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(buildAddressCarta(message));
        addresses.add(buildAddressCliente(message));
        addresses.add(buildAddressImovel(message));
        addresses.removeIf(Objects::isNull);
        return addresses;
    }


    private static Address buildAddressCarta(Mp3Message message) {
        if (message.getCepCarta().isEmpty()) {
            return null;
        }
        return Address.builder()
                .addressType(AddressType.CARTA)
                .postCode(message.getCepCarta())
                .address1(message.getEnderecoCarta())
                .number(message.getNumeroCarta())
                .address2(message.getComplementoCarta())
                .neighborhood(message.getBairroCarta())
                .city(message.getCidadeCarta())
                .state(message.getEstadoCarta())
                .build();
    }

    private static Address buildAddressCliente(Mp3Message message) {
        if (message.getCepCliente().isEmpty()) {
            return null;
        }
        return Address.builder()
                .addressType(AddressType.CLIENTE)
                .postCode(message.getCepCliente())
                .address1(message.getEnderecoCliente())
                .number(message.getNumeroCliente())
                .address2(message.getComplementoCliente())
                .neighborhood(message.getBairroCliente())
                .city(message.getCidadeCliente())
                .state(message.getEstadoCliente())
                .build();
    }

    private static Address buildAddressImovel(Mp3Message message) {
        if (message.getCepImovel().isEmpty()) {
            return null;
        }
        return Address.builder()
                .addressType(AddressType.IMOVEL)
                .postCode(message.getCepImovel())
                .address1(message.getEnderecoImovel())
                .number(message.getNumeroImovel())
                .address2(message.getComplementoImovel())
                .neighborhood(message.getBairroImovel())
                .city(message.getCidadeImovel())
                .state(message.getEstadoImovel())
                .build();
    }

}
