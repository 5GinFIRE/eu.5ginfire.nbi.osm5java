package osm5.ns.yang.nfvo.mano.types.rev170208.alarm.actions;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.mano.types.rev170208.alarm.Actions;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * list ok {
 *   key url;
 *   leaf url {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/alarm/actions/ok</i>
 * 
 * <p>To create instances of this class use {@link OkBuilder}.
 * @see OkBuilder
 * @see OkKey
 *
 */
public interface Ok
    extends
    ChildOf<Actions>,
    Augmentable<Ok>,
    Identifiable<OkKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ok");

    /**
     * @return <code>java.lang.String</code> <code>url</code>, or <code>null</code> if not present
     */
    @Nullable
    String getUrl();
    
    @Override
    OkKey key();

}

