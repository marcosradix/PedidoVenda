package pedidoVendaBean;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DateBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public Date getDate(){
		
		return new Date();
	}
	
}
