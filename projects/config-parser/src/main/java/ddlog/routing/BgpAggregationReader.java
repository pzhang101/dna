// Automatically generated by the DDlog compiler.
package ddlog.routing;
import com.google.flatbuffers.*;
public final class BgpAggregationReader
{
    protected BgpAggregationReader(ddlog.__routing.BgpAggregation inner) { this.inner = inner; }
    private ddlog.__routing.BgpAggregation inner;
    public vnode_tReader node ()
    {
        return new vnode_tReader(this.inner.node());
    }
    public prefix_tReader prefix ()
    {
        return new prefix_tReader(this.inner.prefix());
    }
}