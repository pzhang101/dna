// Automatically generated by the DDlog compiler.
package ddlog.routing;
import com.google.flatbuffers.*;
public final class OspfIntfSettingReader
{
    protected OspfIntfSettingReader(ddlog.__routing.OspfIntfSetting inner) { this.inner = inner; }
    private ddlog.__routing.OspfIntfSetting inner;
    public vnode_tReader node ()
    {
        return new vnode_tReader(this.inner.node());
    }
    public String intf ()
    {
        return this.inner.intf();
    }
    public long cost ()
    {
        return (long)this.inner.cost();
    }
    public long area ()
    {
        return (long)this.inner.area();
    }
    public boolean passive ()
    {
        return this.inner.passive();
    }
    public long process ()
    {
        return (long)this.inner.process();
    }
}