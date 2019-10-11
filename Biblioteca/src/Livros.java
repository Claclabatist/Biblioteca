import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Livros implements Identificavel {
	
	@Id
	private Long Id;
	private int ISBN;
	private Date Ano;
	private String Titulo;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public Date getAno() {
		return Ano;
	}
	public void setAno(Date ano) {
		Ano = ano;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livros other = (Livros) obj;
		if (Ano == null) {
			if (other.Ano != null)
				return false;
		} else if (!Ano.equals(other.Ano))
			return false;
		if (ISBN != other.ISBN)
			return false;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Titulo == null) {
			if (other.Titulo != null)
				return false;
		} else if (!Titulo.equals(other.Titulo))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
