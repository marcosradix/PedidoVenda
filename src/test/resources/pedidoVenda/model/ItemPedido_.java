package pedidoVenda.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-03-24T22:06:37.372-0300")
@StaticMetamodel(ItemPedido.class)
public class ItemPedido_ {
	public static volatile SingularAttribute<ItemPedido, Long> id;
	public static volatile SingularAttribute<ItemPedido, Integer> quantidade;
	public static volatile SingularAttribute<ItemPedido, BigDecimal> valorUnitario;
	public static volatile SingularAttribute<ItemPedido, Pedido> pedido;
}
