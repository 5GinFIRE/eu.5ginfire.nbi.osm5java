package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.supplemental.boot.data;
import java.lang.Boolean;
import javax.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * container supplemental-boot-data {
 *   leaf boot-data-drive {
 *     type boolean;
 *     default false;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/supplemental-boot-data/supplemental-boot-data</i>
 * 
 * <p>To create instances of this class use {@link SupplementalBootDataBuilder}.
 * @see SupplementalBootDataBuilder
 *
 */
public interface SupplementalBootData
    extends
    ChildOf<org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.SupplementalBootData>,
    Augmentable<SupplementalBootData>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("supplemental-boot-data");

    /**
     * Some VIMs implement additional drives to host config-files or meta-data
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>bootDataDrive</code>, or <code>null</code> if not present
     */
    @Nullable
    Boolean isBootDataDrive();

}

