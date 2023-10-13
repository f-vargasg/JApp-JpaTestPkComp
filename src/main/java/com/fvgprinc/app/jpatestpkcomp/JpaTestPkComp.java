

package com.fvgprinc.app.jpatestpkcomp;

import com.fvgprinc.app.jpatestpkcomp.ui.JfrmPrincipal;
import com.fvgprinc.tools.utilities.MySwingUtil;

/**
 *
 * @author garfi
 */
public class JpaTestPkComp {

    public static void main(String[] args) {
        
        MySwingUtil.initUiLookAndFeel(MySwingUtil.LFWINDOWS);
        
        JfrmPrincipal jfrm = new JfrmPrincipal();
        
        jfrm.setLocationRelativeTo(null);
        jfrm.setVisible(true);
    }
}
