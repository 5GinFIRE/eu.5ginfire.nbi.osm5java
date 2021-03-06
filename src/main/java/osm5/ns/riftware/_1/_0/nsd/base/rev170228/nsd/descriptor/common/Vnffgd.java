package osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common;
import java.lang.Override;
import java.util.List;
import javax.annotation.Nullable;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.riftware._1._0.nsd.base.rev170228.$YangModuleInfoImpl;
import osm5.ns.riftware._1._0.nsd.base.rev170228.FgdCommon;
import osm5.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Classifier;
import osm5.ns.riftware._1._0.nsd.base.rev170228.nsd.descriptor.common.vnffgd.Rsp;

/**
 * List of VNF Forwarding Graph Descriptors (VNFFGD).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd-base</b>
 * <pre>
 * list vnffgd {
 *   key id;
 *   uses fgd-common;
 *   list rsp {
 *     key id;
 *     uses rsp-common;
 *     list vnfd-connection-point-ref {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type string;
 *       }
 *       leaf order {
 *         type uint8;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path "../../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *         }
 *       }
 *       leaf vnfd-ingress-connection-point-ref {
 *         type string;
 *       }
 *       leaf vnfd-egress-connection-point-ref {
 *         type string;
 *       }
 *     }
 *   }
 *   list classifier {
 *     key id;
 *     uses classifier-common;
 *     leaf member-vnf-index-ref {
 *       type string;
 *     }
 *     leaf vnfd-id-ref {
 *       type leafref {
 *         path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *       }
 *     }
 *     leaf vnfd-connection-point-ref {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd-base/nsd-descriptor-common/vnffgd</i>
 * 
 * <p>To create instances of this class use {@link VnffgdBuilder}.
 * @see VnffgdBuilder
 * @see VnffgdKey
 *
 */
public interface Vnffgd
    extends
    ChildOf<NsdDescriptorCommon>,
    Augmentable<Vnffgd>,
    FgdCommon,
    Identifiable<VnffgdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vnffgd");

    /**
     * List of Rendered Service Paths (RSP).
     *
     *
     *
     * @return <code>java.util.List</code> <code>rsp</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Rsp> getRsp();
    
    /**
     * List of classifier rules.
     *
     *
     *
     * @return <code>java.util.List</code> <code>classifier</code>, or <code>null</code> if not present
     */
    @Nullable
    List<Classifier> getClassifier();
    
    @Override
    VnffgdKey key();

}

