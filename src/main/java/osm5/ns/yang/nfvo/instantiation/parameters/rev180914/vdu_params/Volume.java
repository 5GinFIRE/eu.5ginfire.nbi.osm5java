package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.vdu_params;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VduParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list volume {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf vim-volume-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vdu_params/volume</i>
 * 
 * <p>To create instances of this class use {@link VolumeBuilder}.
 * @see VolumeBuilder
 * @see VolumeKey
 *
 */
public interface Volume
    extends
    ChildOf<VduParams>,
    Augmentable<Volume>,
    Identifiable<VolumeKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("volume");

    /**
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable
    String getName();
    
    /**
     * @return <code>java.lang.String</code> <code>vimVolumeId</code>, or <code>null</code> if not present
     */
    @Nullable
    String getVimVolumeId();
    
    @Override
    VolumeKey key();

}

