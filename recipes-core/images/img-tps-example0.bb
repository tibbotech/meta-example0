DESCRIPTION = "Tibbo ECorp (Edev)"

LICENSE = "MIT"

require recipes-core/images/inc-p-123.inc
require recipes-core/images/inc-rootfs.inc
require recipes-core/images/inc-tps-gen.inc

IMAGE_FEATURES = ""

IMAGE_FEATURES += "ssh-server-openssh"
IMAGE_INSTALL  += "openssh-sftp-server"
IMAGE_INSTALL  += "systemd-analyze"
IMAGE_FEATURES += "package-management"


IMAGE_INSTALL += "gdbserver"
IMAGE_INSTALL += "tcf-agent"

IMAGE_INSTALL += "tzdata-asia"

#IMAGE_INSTALL += "tps-wan"

IMAGE_INSTALL += "fuse-exfat exfat-utils"

IMAGE_INSTALL += "iproute2"

IMAGE_INSTALL += "tps-dts"

#IMAGE_INSTALL += "ecorp-app0"
