import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("artist")
public class ArtistComponent {
	public Response artistExample() {
		return Response.status(Status.OK).entity("Hello").build();
	}
}
