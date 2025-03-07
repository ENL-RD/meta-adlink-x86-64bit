DESCRIPTION = "ADLINK BSP Image with XFCE X Window"

LICENSE = "MIT"


inherit core-image


REQUIRED_DISTRO_FEATURES = "x11"
DISTRO_FEATURES_append = " polkit"
IMAGE_INSTALL += "packagegroup-core-x11 \
     	 	  packagegroup-xfce-base "
		  
export IMAGE_BASENAME = "adlink-xfce-x86"

# nice to have
RRECOMMENDS_${PN} = " \
    xfce-dusk-gtk3 \
    \
    xfce4-cpufreq-plugin \
    xfce4-cpugraph-plugin \
    xfce4-diskperf-plugin \
    xfce4-mount-plugin \
    xfce4-powermanager-plugin \
    xfce4-closebutton-plugin \
    ${@bb.utils.contains('DISTRO_FEATURES', 'pulseaudio', 'xfce4-pulseaudio-plugin', '', d)} \
    ${@bb.utils.contains("DISTRO_FEATURES", "bluetooth", "blueman", "", d)} \
    \
    thunar-media-tags-plugin \
    thunar-archive-plugin \
    \
    xfce4-appfinder \
    xfce4-screenshooter \
    xfce4-power-manager \
    ristretto \
    gigolo \
"

              



