# Add below conf to local.conf
# DISTRO_FEATURES_remove = " "
# DISTRO_FEATURES_append += " wayland pam x11"

IMAGE_FEATURES += " \
	debug-tweaks \
	tools-testapps \
	tools-profile \
"
require recipes-rk/images/rk-image-multimedia.bb

CORE_IMAGE_EXTRA_INSTALL += " \
	openssh \
	sshfs-fuse \
	dhcp-client \
	glmark2 \
	cpufrequtils \
	usbutils \
	kf5-world \
	polkit-qt-1 \
"
