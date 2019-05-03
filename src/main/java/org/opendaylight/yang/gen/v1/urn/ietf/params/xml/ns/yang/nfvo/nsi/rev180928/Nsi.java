package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsi.rev180928;
import java.lang.Override;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsi</b>
 * <pre>
 * list nsi {
 *   key id;
 *   unique name;
 *   uses nsi;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsi/nsi</i>
 * 
 * <p>To create instances of this class use {@link NsiBuilder}.
 * @see NsiBuilder
 * @see NsiKey
 *
 */
public interface Nsi
    extends
    ChildOf<NsiData>,
    Augmentable<Nsi>,
    Nsi$G,
    Identifiable<NsiKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsi");

    @Override
    NsiKey key();

}
