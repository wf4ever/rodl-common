package pl.psnc.dl.wf4ever.model.ORE;

import java.net.URI;

import pl.psnc.dl.wf4ever.model.RO.Resource;

/**
 * Simple ore:AggregatedResource model.
 * 
 * @author pejot
 * 
 */
public class AggregatedResource extends Resource {

    /**
     * Constructor.
     * 
     * @param uri
     *            the resource uri
     */
    public AggregatedResource(URI uri) {
        super(uri);
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatedResource)) {
            return false;
        }
        AggregatedResource that = (AggregatedResource) obj;
        return that.getUri().equals(this.getUri());
    }
}
