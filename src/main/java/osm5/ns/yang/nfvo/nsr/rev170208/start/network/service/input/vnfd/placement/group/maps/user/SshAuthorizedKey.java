package osm5.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.user;
import java.lang.Object;
import java.lang.Override;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.nsr.rev170208.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.nsr.rev170208.start.network.service.input.vnfd.placement.group.maps.User;

/**
 * Used to configure the list of public keys to be injected as partof ns 
 * instantiation
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list ssh-authorized-key {
 *   key key-pair-ref;
 *   leaf key-pair-ref {
 *     type leafref {
 *       path /rw-project:project[rw-project:name=current()/../../../../project-name]/key-pair/name;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/start-network-service/input/vnfd-placement-group-maps/user/ssh-authorized-key</i>
 * 
 * <p>To create instances of this class use {@link SshAuthorizedKeyBuilder}.
 * @see SshAuthorizedKeyBuilder
 * @see SshAuthorizedKeyKey
 *
 */
public interface SshAuthorizedKey
    extends
    ChildOf<User>,
    Augmentable<SshAuthorizedKey>,
    Identifiable<SshAuthorizedKeyKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ssh-authorized-key");

    /**
     * A reference to the key pair entry in the global key pair table
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>keyPairRef</code>, or <code>null</code> if not present
     */
    @Nullable
    Object getKeyPairRef();
    
    @Override
    SshAuthorizedKeyKey key();

}

