// Automatically generated by the DDlog compiler.
package ddlog.routing;
import com.google.flatbuffers.*;
public final class BgpRedisReader
{
    protected BgpRedisReader(ddlog.__routing.BgpRedis inner) { this.inner = inner; }
    private ddlog.__routing.BgpRedis inner;
    public vnode_tReader node ()
    {
        return new vnode_tReader(this.inner.node());
    }
    public String protocol ()
    {
        return this.inner.protocol();
    }
}